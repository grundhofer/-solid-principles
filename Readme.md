Die SOLID-Prinzipien sind:

## Single Responsibility Principle (SRP) - jede Klasse sollte nur eine einzige Verantwortung haben.

Das Single Responsibility Principle (SRP) besagt, dass jede Klasse oder jedes Modul in einer Software nur eine einzige
Verantwortung haben sollte. Dies bedeutet, dass jede Klasse ihre eigene spezifische Aufgabe hat und dafür verantwortlich
ist, und keine anderen Aufgaben übernimmt, die besser in einer anderen Klasse untergebracht sind. Dadurch wird
sichergestellt, dass die Klassen übersichtlich und einfach zu warten sind, und dass Änderungen an einer Klasse keine
unerwarteten Auswirkungen auf andere Teile des Systems haben. Auf diese Weise wird es auch einfacher, den Code zu testen
und zu ändern, ohne dass andere Teile des Systems beeinträchtigt werden.

## Open-Closed Principle (OCP) - ein Modul sollte offen für Erweiterungen sein, aber geschlossen für Änderungen.

Das zweite Solid Principle lautet "Open-Closed Principle" (OCP). Das OCP besagt, dass eine Softwareeinheit (z.B. eine
Klasse oder eine Methode) für Erweiterungen offen sein sollte, aber für Änderungen geschlossen sein sollte. Das
bedeutet, dass neue Funktionalitäten durch Hinzufügen von neuem Code hinzugefügt werden sollten, anstatt bestehenden
Code zu ändern. Dadurch wird vermieden, dass Änderungen an einer Stelle unvorhergesehene Auswirkungen auf andere Teile
des Codes haben, was die Wartbarkeit und die Flexibilität der Software erhöht.

Das Open-Closed-Prinzip bietet mehrere Vorteile:

Flexibilität und Wartbarkeit: Durch die Einhaltung des OCP wird die Flexibilität und Wartbarkeit der Software
verbessert. Da Änderungen an bestehendem Code vermieden werden und neue Funktionen durch Hinzufügen von Code hinzugefügt
werden, wird der Code stabiler und einfacher zu warten.

Erweiterbarkeit: Das OCP ermöglicht die einfache Erweiterung der Software durch Hinzufügen neuer Funktionalitäten. Neue
Funktionen können durch Hinzufügen neuer Klassen oder Interfaces implementiert werden, ohne den bestehenden Code zu
ändern.

Vermeidung von Fehlern: Änderungen an bestehendem Code können unvorhergesehene Auswirkungen auf andere Teile der
Software haben und zu Fehlern führen. Das OCP minimiert das Risiko von Fehlern, indem Änderungen vermieden werden.

Wiederverwendbarkeit: Durch die Verwendung von Interfaces und abstrakten Klassen, die das OCP unterstützen, können
Codebausteine wiederverwendet werden, was die Effizienz und Produktivität erhöht.

Insgesamt kann das OCP dazu beitragen, dass Software robust, flexibel und einfach zu warten ist, was zu einer höheren
Qualität und Zuverlässigkeit der Software führt.

## Liskov Substitution Principle (LSP) - Untertypen sollten in der Lage sein, ihre Basistypen zu ersetzen, ohne dass die korrekte Ausführung des Programms beeinträchtigt wird.

## Interface Segregation Principle (ISP) - Eine Klasse sollte nicht von Interfaces abhängen, die ihr nicht von Nutzen sind.

## Dependency Inversion Principle (DIP) - Abhängigkeiten sollten auf abstrakten Typen, nicht auf konkreten Typen basieren.

