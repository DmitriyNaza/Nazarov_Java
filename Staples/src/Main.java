/*
Задача:
Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?

Какая может быть логика:
Если есть открывающая скобка, значит должна быть закрывающая. Следовательно,
число открывающихся скобок должно быть равно числу закрывающихся. В примере у нас 6 скобок открывают и
5 закрывают. Это уже приведет к ошибке. + вижу, что есть лишний знак "]", что тоже приведет к ошибке.
Можем представить, что в каждой скобке будет пример 1+1:
[((())()(())]]
[(1+1(1+1(1+1)1+1)(1+1)(1+1(1+1)1+1)]]
Сразу видно, что будет ошибка. Мало того, что кол-во скобок разное,
так еще и последовательность нарушена. У нас на 5-ой скобке все сломалось. Открыли 3 скобки, закрыли 2
и сразу открыли другую. Это приведет к ошибке.
Корректный пример
[((()))()(())]

 */
