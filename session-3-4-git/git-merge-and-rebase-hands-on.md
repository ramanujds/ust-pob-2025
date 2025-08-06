
### Git Branch Commands:

1. **Create a New Branch:**
   ```bash
   git branch feature-branch
   ```

2. **Switch to a Branch:**
   ```bash
   git checkout feature-branch
   ```
   or
   ```bash
   git switch feature-branch
   ```
   (Note: In Git versions 2.23 and later, you can use `git switch` instead of `git checkout`)

3. **Create and Switch to a New Branch:**
   ```bash
   git checkout -b new-feature-branch
   ```
   or
   ```bash
   git switch -c new-feature-branch
   ```

4. **List Branches:**
   ```bash
   git branch
   ```

### Git Merge Commands:

1. **Merge a Branch into the Current Branch:**
   ```bash
   # First, switch to the branch where you want to merge changes
   git switch main

   # Then, merge the feature-branch into main
   git merge feature-branch
   ```

### Git Rebase Commands:

1. **Rebase a Branch onto Another Branch:**
   ```bash
   # First, switch to the branch that you want to rebase (e.g., feature-branch)
   git switch feature-branch

   # Then, rebase feature-branch onto main
   git rebase main
   ```

2. **Interactive Rebase:**
   ```bash
   # Start an interactive rebase to squash or re-order commits
   git rebase -i HEAD~n
   ```
   - An interactive rebase opens a text editor with a list of commits. You can choose to squash, edit, reword, or delete commits.

3. **Continue After Resolving Conflicts During Rebase:**
   ```bash
   # If conflicts occur during rebase, resolve them manually and then continue
   git rebase --continue
   ```

4. **Abort a Rebase:**
   ```bash
   # If something goes wrong during rebase, you can abort it
   git rebase --abort
   ```

### Example Scenario:

Let's walk through an example scenario:

1. **Create a Feature Branch:**
   ```bash
   git checkout -b feature-branch
   ```

2. **Make Changes, Commit:**
   ```bash
   # Make changes to files
   git add .
   git commit -m "Implement new feature"
   ```

3. **Switch to Main, Merge Feature Branch:**
   ```bash
   git switch main
   git merge feature-branch
   ```

4. **Create and Switch to Another Feature Branch:**
   ```bash
   git checkout -b another-feature-branch
   ```

5. **Make Changes, Commit:**
   ```bash
   # Make changes to files
   git add .
   git commit -m "Another feature implementation"
   ```

6. **Rebase Another Feature Branch onto Main:**
   ```bash
   git switch another-feature-branch
   git rebase main
   ```
