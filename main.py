import sys
import os
import ProcessInfo


def main():
    try:
        ProcessInfo.ConfigureLogger()

        if len(sys.argv) != 1:
            raise ValueError("This program does not accept command line arguments.")

        if ProcessInfo.ValidateArguments():

            ProcessInfo.GetProcessInformation()

    except ValueError as e:
        import logging
        logging.error(e)

    except Exception as e:
        import logging
        logging.error(e)


if __name__ == "__main__":
    main()