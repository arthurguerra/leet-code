function isAnagram(s: string, t: string): boolean {
    if (s.length !== t.length)
        return false;

    const arrayS = s.split("");
    const arrayT = t.split("");

    arrayS.sort();
    arrayT.sort();

    return JSON.stringify(arrayS) === JSON.stringify(arrayT);
}

const test1Word1 = "anagram";
const test1Word2 = "nagaram";

console.log("Test 1: ", isAnagram(test1Word1, test1Word2));

const test2Word1 = "rat";
const test2Word2 = "car";

console.log("Test 2: ", isAnagram(test2Word1, test2Word2));
