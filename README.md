# RSN JUnit Test

###
Задание для взаимопроверки
Обратная польская нотация (англ. Reverse Polish notation, RPN) — способ записи математических выражений, при котором операнды (числа) записываются перед знаками операций. Например, запись 4 3 + обозначает, что нужно сложить числа 4 и 3, а запись 1 2 3 - + исполнится в два этапа. Сначала из числа 2 нужно вычесть 3, что упростит выражение до 1 -1 +, а затем сложить -1 с 1 и получить 0.
При обратной польской нотации операции не имеют приоритета, а результат выражения можно считать слева направо. Всякий раз, когда встречается новая операция, необходимо исполнить её над двумя последними операндами, а затем записать результат вместо этой операции и двух операндов.
В качестве примера для вас реализован алгоритм обратной польской нотации, поддерживающий операции +, -, *, а также отрицательные числа. Выражение в польской нотации должно передаваться в виде строки, где операнды и операции разделены произвольным количеством пробелов. Напишите набор тест-кейсов для проверки этой реализации. В данном примере вам не нужно разбираться в коде ReversePolishNotationCalculator. Достаточно проверить, что код работает для операций +, -, *, а также что он правильно обрабатывает пробельные символы и отрицательные числа.
###
