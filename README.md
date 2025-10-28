# LeetCode Solutions

My personal collection of LeetCode problem solutions with detailed thought processes and multiple language implementations.

## Structure
Each problem includes:
- **Detailed thought process** and solution approach
- **Time/Space complexity analysis**
- **Multiple implementations** (Java, TypeScript, Python planned)

## Solutions by Category

### Arrays & Hashing
- [Contains Duplicate](./Arrays&Hashing/contains_duplicate/README.md) - Detect duplicate values in array

## Languages Used
- **Java** - Located in `src/main/java/` (Maven project structure)
- **TypeScript** - Located alongside problem folders
- **Python** - Planned for future implementation

## Running Solutions

### Java
```bash
mvn compile exec:java -Dexec.mainClass="arrays_hashing.ContainsDuplicate"
```

### TypeScript
```bash
npm run dev "Arrays&Hashing/contains_duplicate/contains-duplicate.ts"
```

## Development Setup
- Java: Maven project with IDE support
- TypeScript: Configured with proper type checking and IntelliSense
- All build files and dependencies are gitignored to keep repo clean