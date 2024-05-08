# Account Class

This Java class represents a basic bank account management system. It allows users to register, deposit/withdraw money, change passwords, and perform various transactions.

## Usage

1. **Constructor**: Upon creating an instance of the `Account` class, the user is prompted to register by providing their full name, ID number, password, and answering a security question.

2. **Login**: After registration, users can log in with their ID number and password.

3. **Transaction Menu**: Once logged in, users are presented with a menu where they can choose various actions:
   - Deposit money into their account.
   - Withdraw money from their account (if sufficient balance).
   - Change their password.
   - Exit the program.

4. **Deposit**: Users can deposit money into their account by entering the desired amount.

5. **Withdrawal**: Users can withdraw money from their account, provided they have sufficient balance.

6. **Change Password**: Users can change their password by answering their security question.

7. **Exit**: Users can safely exit the program.

## Attributes

- `fullName`: User's full name.
- `IdNo`: User's ID number.
- `securityQuestion`: User's security question answer.
- `password`: User's password.
- `balance`: User's account balance.
- `selector`: Selected option for transaction.
- `loading`, `bracket`, `warning`: Strings for display purposes.

## Methods

- `warning()`: Prints a warning message.
- `bracket()`: Prints a bracket line.
- `loading()`: Prints a loading message.
- Getters and setters for all attributes.

## Contributors

- **Furkan Aydemir**
- **deerborg**

## Version History

- **Version**: alpha 1.1
- **Release Date**: 2024

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
