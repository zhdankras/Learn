#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

	struct teacher
	{
		long id;
		char name[64];
		char title[32];
		int hours;
	};

	teacher directory[50];
	int directory_size=0;

	bool read_from_text_file(char file_name[])
	{
		FILE *file = fopen(file_name, "r");

		if (!file)
		{
			printf("The file was not found\n");
			return false;
		}

		int teacher_count = 0;
		char line[256];
		while (fgets(line, sizeof(line), file))
		{
			if(teacher_count > 50)
			{
				printf("[ERROR] Too many entries in the input file : more than 50");
				return false;
			}

			char* token = strtok(line,":");

			if(!token)
			{
				printf("[ERROR] Line '%s' seems to be wrong - missing : sign", line);
				return false;
			}
			
			int token_count = 0;

			while(token)
			{
				token_count+=1;
				if(token_count == 1) directory[teacher_count].id = atoi(token);
				else if (token_count == 2) strcpy(directory[teacher_count].name,token);
				else if (token_count == 3) strcpy(directory[teacher_count].title,token);
				else if (token_count == 4) directory[teacher_count].hours = atoi(token);
				else 
				{
					printf("[ERROR] Too many entries in the input line '%s' : more than4 values", line);
					return false;
				}
				token = strtok(0, ":");
			}
			teacher_count += 1;
		}
		printf("Total entries read: %i\n", teacher_count);
		directory_size = teacher_count;
		return true;
	}

	void sort_directory()
	{
		bool sorted = false;
		teacher temp;
		while(!sorted)
		{
			sorted=true;
			for (int i = 0; i < directory_size-1; ++i)
			{
				if (directory[i].id > directory[i+1].id)
				{
					sorted=false;
					memcpy(&temp,&directory[i],sizeof(teacher));
					memcpy(&directory[i],&directory[i+1],sizeof(teacher));
					memcpy(&directory[i+1],&temp,sizeof(teacher));
				}
			}
		}
	}

	void print_directory(int index=0)
	{
		if(index != 0 && index < directory_size)
		{
			printf("Id: %lu Name: \"%s\" Title: \"%s\" Hours: %d\n",
			directory[index].id, directory[index].name, directory[index].title, directory[index].hours);
			return;
		}

		for (int i = 0; i < directory_size; ++i)
		{
			printf("Id: %lu Name: \"%s\" Title: \"%s\" Hours: %d\n", directory[i].id,
			directory[i].name, directory[i].title, directory[i].hours);
		}
	}

	int search_directory(long value)
	{
		float jump_size = directory_size/2;
		float current_index_float = directory_size/2;
		long current_value = directory[int(current_index_float)].id;
		while(jump_size>=0.5)
		{
			long current_value = directory[int(current_index_float)].id;
			printf("jump_size = %f current_index_float = %f current_value = %d\n", jump_size, current_index_float, current_value);
			if(value == current_value)
				return int(current_index_float);
			else if(value > current_value)
				current_index_float=current_index_float+jump_size/2;
			else
				current_index_float=current_index_float-jump_size/2;
			jump_size/=2;
		}
		return -1;
	}

	void write_binary_file(char file_name[])
	{
		FILE* file = fopen(file_name, "wb");
		fwrite(&directory_size,sizeof(directory_size),1,file);
		fwrite(&directory,sizeof(teacher),directory_size,file);
		fclose(file);
	}

	void read_binary_file(char file_name[])
	{
		FILE* file = fopen(file_name, "rb");
		fread(&directory_size,sizeof(directory_size),1,file);
		fread(&directory,sizeof(teacher),directory_size,file);
		fclose(file);
	}

	int main(int argc, char* argv[])
	{
		if(argc != 2)
		{
			printf("Please provide teacher id number to search for as a single command
			line argument\n");
			return 1;
		}

		int search_id = atoi(argv[1]);
		char file_name[] = "teachers.txt";
		char file_name_binary[] = "teachers.bin";
		printf("Reading file %s\n",file_name);

		if (!read_from_text_file(file_name)) return 1;

		printf("\n");
		printf("Before sort:\n");
		print_directory();
		sort_directory();
		printf("\n");
		printf("After sort:\n");
		print_directory();
		printf("\n");
		printf("Searching for id = %d\n", search_id);
		int found_index = search_directory(search_id);

		if (found_index>0)
		{
			printf("Entry with id=%d found:\n", search_id);
			print_directory(found_index);
		}
		else printf("Entry with id=%d not found\n", search_id);

		printf("\n");
		printf("Writing binary file.\n");
		write_binary_file(file_name_binary);
		printf("Reading binary file.\n");
		read_binary_file(file_name_binary);
		printf("\n");
		printf("After reading binary file:\n");
		print_directory();

		return 0;
	}
