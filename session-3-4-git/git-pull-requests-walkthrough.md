## How to perform and raise a request for code reviews:

1. **Create a Feature Branch:**
   - Before starting any new development, create a new branch from the main branch. Use a clear and descriptive name for the branch.

2. **Write Code:**
   - Write your code changes on this feature branch. Follow coding standards, and make sure the code is well-documented.

3. **Commit Changes:**
   - Commit your changes locally with meaningful commit messages. Divide your work into logical and cohesive commits.

4. **Push to Remote:**
   - Push your feature branch to the remote repository.

5. **Create Pull Request (PR):**
   - On the repository platform (like GitHub, GitLab, Bitbucket), create a Pull Request from your feature branch to the main branch.

6. **Provide Details:**
   - Add a clear title and description to the Pull Request, summarizing the changes and highlighting any areas that need attention.

7. **Request Code Review:**
   - Assign reviewers to your PR, seeking feedback on your code changes.

### b. Merging in git:

1. **Review PR:**
   - Wait for code reviews and address any comments or concerns raised by the reviewers.

2. **Resolve Discussions:**
   - Resolve any discussions or comments on the PR.

3. **Approval:**
   - Once the PR is approved, and all checks (like tests and automated processes) pass, you are ready to merge.

4. **Merge Button:**
   - Use the merge button on the repository platform to merge your changes into the main branch.
  




## **Example Workflow with Commands**

### **1. Cloning the Repository**
```bash
git clone https://github.com/username/repository.git
cd repository
```

### **2. Creating a Branch for a New Feature**
```bash
git checkout -b feature/add-user-authentication
```

### **3. Making Changes and Committing**
```bash
# Edit files
git add .
git commit -m "Implement user authentication feature"
```

### **4. Pushing the Feature Branch**
```bash
git push origin feature/add-user-authentication
```

### **5. Opening a Pull Request**
- Go to the repository on GitHub.
- Navigate to **Pull Requests** > **New Pull Request**.
- Select the source branch (`feature/add-user-authentication`) and the target branch (`main`).

### **6. Reviewing and Merging**
- Reviewer suggests changes.
- After approval, merge the pull request on GitHub.
- Alternatively, merge locally:
  ```bash
  git checkout main
  git pull origin main
  git merge feature/add-user-authentication
  git push origin main
  ```

### **7. Cleaning Up**
- Delete the merged branch:
  ```bash
  git branch -d feature/add-user-authentication
  git push origin --delete feature/add-user-authentication
  ```



