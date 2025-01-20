# ArchUnit Playground
This repository is a playground for experimenting with [ArchUnit](https://www.archunit.org/) APIs

## Scenarios
 - Enforcing specific imports across multiple modules
   - `moduleone` should not import `Set` data type
   - `moduletwo` should not import `List` data type
   - `archunit-tests` executes rules to verify above enforcements