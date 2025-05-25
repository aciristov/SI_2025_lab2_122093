# Втора лабораториска вежба по Софтверско инженерство
Александар Ристов, бр.индекс 122093
# Control Flow Graph
![control flow graph](https://github.com/user-attachments/assets/fe62d0b8-7166-4732-ade7-39d277e28ea4)
Цикломатска комплексност:
Пресметаната цикломатска/логичка комплексност според графикот кој го имам на сликата има: 23 јазли, 29 раба и се пресметува како V(G) = E(бр. раб) – N(бр. јазли) + 2. 
V(G) = 29 - 23 + 2 = 8. Ако V(G) = P + 1 тогаш P = 7. Бројот на региони е 8. Тоа значи дека додека бројот на региони V(G) е поголем, поголема е веројатноста за грешки на програмата со повеќе региони.
Every statement критериум:
Според овој критериум значи дека ќе треба да се опфати секој функционален дел од програмата барем еднаш. 
Следните функционалнсти го опфаќаат секој дел од програмата:
allItems == null, опфаќа линија 54
i < allItems.size() опфаќа линија 60
i >= allItems.size() опфаќа линија 60
item.getName() == null || item.getName().length() == 0 опфаќа линија 62
item.getName() == null || item.getName().length() != 0 опфаќа линија 62
item.getName() != null || item.getName().length() == 0 опфаќа линија 62
item.getName() != null || item.getName().length() != 0 опфаќа линија 62
throw new RuntimeException("Invalid item!");  опфаќа линија 63
item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10 опфаќа линија 66
  Во овој дел бидејќи имаме три различни случаеви, ова е комбинација од 3 = 8 тест случаеви
item.getDiscount() > 0 опфаќа линија 70
item.getDiscount() <= 0 опфаќа линија 70
cardNumber != null && cardNumber.length() == 16 опфаќа линија 77
cardNumber != null && cardNumber.length() != 16 опфаќа линија 77
cardNumber == null && cardNumber.length() == 16 опфаќа линија 77
cardNumber == null && cardNumber.length() != 16 опфаќа линија 77
j < cardNumber.length() опфаќа линија 80
j >= cardNumber.length() опфаќа линија 80
allowed.indexOf(c) == -1 опфаќа линија 82
allowed.indexOf(c) != -1 опфаќа линија 82
throw new RuntimeException("Invalid character in card number!"); опфаќа линија 83 
throw new RuntimeException("Invalid card number!"); опфаќа линија 87
return sum; опфаќа линија 90

Овие се функционалните делови кои го опфаќаат критериумот по every statement.
За истиот критериум да се постигне со минимум случаеви, доволни се сите услови да се опфатат (statements), во нашиот пример како if.. for.. итн. Нивниот број со секој опфатен услов

Multiple Condition критериумот за условот if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10), мора да ги опфати сите комбинации како минимален бтој за да се исполни условот. 
Бидејќи се работи за "или" во условот, трите комбинации мора да бидат посебно. Значи во овој случај имаме комбинација од 3 случаеви, 2*2*2 = 8 комбинации.
Ќе пробам да ѓи напишам:
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() <= 10)
if (item.getPrice() > 300 || item.getDiscount() <= 0 || item.getQuantity() > 10)
if (item.getPrice() <= 300 || item.getDiscount() > 0 || item.getQuantity() > 10)
if (item.getPrice() > 300 || item.getDiscount() <= 0 || item.getQuantity() <= 10)
if (item.getPrice() <= 300 || item.getDiscount() <= 0 || item.getQuantity() > 10)
if (item.getPrice() <= 300 || item.getDiscount() > 0 || item.getQuantity() <= 10)
if (item.getPrice() <= 300 || item.getDiscount() <= 0 || item.getQuantity() <= 10)
Ова се сите, а воедно и минимален број на тест случаеви за да се постигне критериумот.
