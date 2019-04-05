# kibit-check-fail-exit-code

This code introduces a require in `kibit-check-fail-exit-code.core` that causes as
kibit `Check failed` error to occur.

```
$ lein kibit
Check failed -- skipping rest of file
nth not supported on this type: Symbol
$ echo $?
0
```
