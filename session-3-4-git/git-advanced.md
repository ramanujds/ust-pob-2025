`git rebase -i` — Rewrite Commit History Interactively

### Use Case:

Perfect for **cleaning up commit history** before pushing or sharing.

### Start interactive rebase:

```bash
git rebase -i HEAD~3
```

This opens a text editor:

```
pick 123abc First commit
pick 456def Second commit
pick 789ghi Third commit
```

You can replace `pick` with:

| Command  | What it does          |
| -------- | --------------------- |
| `pick`   | Keep as-is            |
| `reword` | Change commit message |
| `edit`   | Pause to amend        |
| `squash` | Combine with previous |
| `drop`   | Delete commit         |

### Example: Combine 3 commits into 1

Change to:

```
pick 123abc First commit
squash 456def Second commit
squash 789ghi Third commit
```

Git will then let you write a new commit message for the combined commit.

### Finish the rebase:

```bash
git rebase --continue
```



