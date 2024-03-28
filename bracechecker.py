import os

def check_mismatched_braces(file_path):
    try:
        with open(file_path, 'r', encoding='utf-8') as file:
            content = file.read()
            # Count occurrences
            open_braces = content.count('[')
            close_braces = content.count(']')
            
            if open_braces != close_braces:
                return True, open_braces, close_braces
    except UnicodeDecodeError:
        # Skip binary files
        pass
    except Exception as e:
        print(f"Error processing file {file_path}: {e}")
    
    return False, 0, 0

def iterate_files(directory):
    for root, _, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(root, file)
            is_mismatched, open_braces, close_braces = check_mismatched_braces(file_path)
            if is_mismatched:
                print(f"Mismatched braces in {file_path}: {{ = {open_braces}, }} = {close_braces}")

# Replace 'your_directory_path_here' with the path to the directory you want to check
directory_path = '/Users/benb/Desktop/uSkyBlock-master 3/'
iterate_files(directory_path)
