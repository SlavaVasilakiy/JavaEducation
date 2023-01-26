class View():

    def getValue(self, ph) -> float:
        return float(input(ph))

    def menuCalc(self):
        return int(input("MENU\n----------------\n"
                         "1.Addition\n2.Substract\n"
                         "3.Multiplication\n"
                         "4.Division\n----------------\n"
                         "0.Exit\n"))

    def printres(self, data, title):
        print(title, " ", data)