## Git Basics Walkthrogh


**Setting Up Git:**
1. **Installation:**
   - Download and install Git from the official website: [Git Downloads](https://git-scm.com/downloads)

2. **Configuration:**
   - Set up user details: `git config --global user.name "Your Name"`
   - Set up email: `git config --global user.email "you@example.com"`

3. **Initialization:**
   - Create a new repository: `git init` in the desired directory.

**Different Files and Folders and Terminologies in Git:**
1. **Working Directory:**
   - The directory on your local machine where you manipulate files.

2. **Staging Area (Index):**
   - An intermediate area where changes are prepared before committing using `git add`.

3. **Repository:**
   - The .git folder containing all the version history.

4. **Commit:**
   - A snapshot of changes made to the repository.

5. **Branch:**
   - A parallel version of the code that can be developed independently.

6. **Merge:**
   - Integrating changes from one branch into another.

7. **Pull Request (PR):**
   - A proposed change to a repository submitted by a user.

8. **Clone:**
   - Copying a repository from a remote source to your local machine.

9. **Push:**
   - Uploading local repository changes to a remote repository.

10. **Pull:**
    - Downloading changes from a remote repository to a local machine.


## Some basic Git commands:

1. **Initialize a Repository:**
   - **Command:** `git init`
   - **Description:** Initializes a new Git repository in the current directory.
   - **Example:**
     ```bash
     mkdir my_project
     cd my_project
     git init
     ```

2. **Clone a Repository:**
   - **Command:** `git clone <repository_url>`
   - **Description:** Creates a copy of a remote repository on your local machine.
   - **Example:**
     ```bash
     git clone https://github.com/example/repo.git
     ```

3. **Add Changes to Staging Area:**
   - **Command:** `git add <file>`
   - **Description:** Stages changes for the next commit.
   - **Example:**
     ```bash
     git add myfile.txt
     ```

4. **Commit Changes:**
   - **Command:** `git commit -m "Commit message"`
   - **Description:** Records staged changes in the repository.
   - **Example:**
     ```bash
     git commit -m "Add initial version of myfile.txt"
     ```

5. **Check Repository Status:**
   - **Command:** `git status`
   - **Description:** Displays the current status of the working directory.
   - **Example:**
     ```bash
     git status
     ```

6. **View Commit History:**
   - **Command:** `git log`
   - **Description:** Shows a log of all commits in the repository.
   - **Example:**
     ```bash
     git log
     ```

7. **Create a Branch:**
   - **Command:** `git branch <branch_name>`
   - **Description:** Creates a new branch.
   - **Example:**
     ```bash
     git branch feature-branch
     ```

8. **Switch to a Branch:**
   - **Command:** `git checkout <branch_name>`
   - **Description:** Switches to the specified branch.
   - **Example:**
     ```bash
     git checkout feature-branch
     ```

9. **Merge Branches:**
   - **Command:** `git merge <branch_name>`
   - **Description:** Merges changes from one branch into another.
   - **Example:**
     ```bash
     git checkout main
     git merge feature-branch
     ```

10. **Push Changes to Remote Repository:**
    - **Command:** `git push <remote_name> <branch_name>`
    - **Description:** Uploads local branch commits to a remote repository.
    - **Example:**
      ```bash
      git push origin main
      ```

11. **Pull Changes from Remote Repository:**
    - **Command:** `git pull <remote_name> <branch_name>`
    - **Description:** Downloads changes from a remote repository to your local machine.
    - **Example:**
      ```bash
      git pull origin main
      ```

12. **Configure User Information:**
    - **Command:** 
      ```bash
      git config --global user.name "Your Name"
      git config --global user.email "your.email@example.com"
      ```
    - **Description:** Sets the name and email associated with your Git commits.
    - **Example:**
      ```bash
      git config --global user.name "John Doe"
      git config --global user.email "john.doe@example.com"
      ```




### Merging in Git

Merging is the process of combining changes from different branches into a single branch. Here's how to perform a merge in Git:

- **Basic Merging:**
  - Switch to the branch where you want to merge changes.
  - Use the `git merge` command followed by the branch name to merge changes.

- **Fast-forward Merging:**
  - When the branch being merged is a direct ancestor, Git performs a fast-forward merge.

### Multiple Commits (Squash Commits) in Git
Squashing commits allows combining multiple commits into a single commit for cleaner version history:

- **Squashing Commits:**
  - Use `git rebase -i HEAD~n`, where n is the number of commits you want to squash.
  - In the interactive rebase, replace "pick" with "squash" or "s" for the commits you want to squash.

### Merge Conflicts in Git

Merge conflicts occur when Git cannot automatically merge changes from different branches. Common scenarios leading to conflicts include:

- **Simultaneous Edits:**
  - When two branches modify the same line in conflicting ways.

- **Deleted File or Renamed Files:**
  - Conflicts can occur when one branch deletes a file or renames it while the other modifies it.

### Handling Merge Conflicts
To resolve merge conflicts, follow these steps:

- **Locate Conflicts:**
  - Git marks conflicted files. Open these files to locate and resolve conflicts manually.

- **Resolve Conflicts:**
  - Edit the conflicted files, keeping the desired changes.

- **Mark as Resolved:**
  - Use `git add` to mark the files as resolved.

- **Complete Merge:**
  - Continue with `git merge --continue` or `git rebase --continue` to complete the merge.

