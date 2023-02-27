# Word count lab template

Write your own implementation of WordCount class

1. `mostUsedWords` should return 5 most frequently used words together with the number of times they are used. Expected result (checked by the test):

```
the  23243
and  18618
of   15690
I    22225
to   16339
```

2. `longestWords` should return 3 sets of the longest words. The result must be a map where key is the lengh of the word, and the value is a set of words of the given lengh. Only top 3 entries should be returned. Expected result:

```
27 [honorificabilitudinitatibus]
17 [Anthropophaginian, indistinguishable, undistinguishable] 
16 [Northamptonshire, incomprehensible, superserviceable]
```

3. `anagrams` should return 3 best anagrams. Anagram is the set of the words that consist of the same letters, like "live-vile-evil-veil". The bigger the set of the words is the better. If two sets consist of equal number of words, the longer the word is the better. Expected result:

```
[pales, lapse, pleas, leaps, peals]
[spear, pears, reaps, rapes, spare]
[hares, shear, share, hears, asher]
```
