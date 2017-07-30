#!/usr/bin/env bash

while IFS=: read -r -a input; do
 printf "%s\n" "${input[0]}"
done < fullname.txt