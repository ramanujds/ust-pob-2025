##  **Undo Unstaged Changes (Working Directory Only)**

You modified files, but haven’t staged them yet.

```bash
git restore filename           # Undo changes to a specific file
git restore .                  # Undo all unstaged changes in working directory
```

> You can also use:
>
> ```bash
> git checkout -- filename  # Old syntax (still works)
> ```

---

## **Undo Staged Changes (Unstage Files)**

You ran `git add`, but want to unstage before committing:

```bash
git restore --staged filename   # Unstage a specific file
git restore --staged .          # Unstage everything
```

---

## **Undo Last Commit (but keep changes in working directory)**

```bash
git reset --soft HEAD~1
```

> This keeps your code changes and unstages them.

---

## **Undo Last Commit (and discard changes)**

```bash
git reset --hard HEAD~1
```

> This **deletes** the commit and all local changes. Be careful!

---

##  **Undo a Commit in History (and keep history clean)**

If you already pushed the commit and want to revert its effect:

```bash
git revert <commit_hash>
```

> This creates a new commit that undoes the changes from the specified commit — safe for shared branches.

---

## **Discard All Local Changes and Commits (hard reset)**

```bash
git reset --hard origin/main  # or origin/master
```

> Danger zone: This will make your local branch match the remote and erase all local work!

---

