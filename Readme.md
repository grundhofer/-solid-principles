Die SOLID-Prinzipien sind:

Single Responsibility Principle (SRP) - Jede Klasse sollte nur eine einzige Verantwortung haben.

Open-Closed Principle (OCP) - Ein Modul sollte offen für Erweiterungen sein, aber geschlossen für Änderungen.

Liskov Substitution Principle (LSP) - Untertypen sollten in der Lage sein, ihre Basistypen zu ersetzen, ohne dass die
korrekte Ausführung des Programms beeinträchtigt wird.

Interface Segregation Principle (ISP) - Eine Klasse sollte nicht von Interfaces abhängen, die ihr nicht von Nutzen sind.

Dependency Inversion Principle (DIP) - Abhängigkeiten sollten auf abstrakten Typen, nicht auf konkreten Typen basieren.

Das Single Responsibility Principle (SRP) besagt, dass jede Klasse oder jedes Modul in einer Software nur eine einzige
Verantwortung haben sollte. Dies bedeutet, dass jede Klasse ihre eigene spezifische Aufgabe hat und dafür verantwortlich
ist, und keine anderen Aufgaben übernimmt, die besser in einer anderen Klasse untergebracht sind. Dadurch wird
sichergestellt, dass die Klassen übersichtlich und einfach zu warten sind, und dass Änderungen an einer Klasse keine
unerwarteten Auswirkungen auf andere Teile des Systems haben. Auf diese Weise wird es auch einfacher, den Code zu testen
und zu ändern, ohne dass andere Teile des Systems beeinträchtigt werden.