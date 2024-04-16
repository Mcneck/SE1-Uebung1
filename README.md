# SE1-Uebung1

Frage 1: Wie können Sie unter Berücksichtigung der Prinzipien des
objektorientierten Entwurfs dafür sorgen, dass der Code, der den beiden
Implementierungen gemeinsam ist, nicht dupliziert wird?

Antwort: es wird eine abstrakte Klasse erstellt (hier die Klasse Validation), in welche der Code geschrieben wird, den beide Implementierungen nutzen.

Frage 2: Wie kann die Objekterzeugung mit Hilfe einer zusätzlichen Klasse
durchgeführt werden? In welchem Package sollte diese zusätzliche Klasse
liegen?

Antwort: Es wird eine Factory Klasse implementiert, welche Methoden bereitstellt um Objekte zu erzeugen. Die Klasse liegt in einem eigenen factory package.

Frage 3: Welches Entwurfsmuster liegt für diesen Anwendungsfall nahe?
Welchen Vorteil bringt die Nutzung dieses Entwurfsmusters?

Antwort: Es liegt ein creational pattern vor, dieses bietet mehrere Vorteile. Creational pattern strukturieren den Erzeugungscode von Objekten klarer und erhöhen somit die Testbarkeit und Wartbarkeit des Codes.

Frage 4: Warum sollten Testfälle in einer separaten Test-Klasse implementiert
werden?

Antwort: Testfälle sollten in separaten Test-Klassen implementiert werden um eine klare Trennung zwischen Testlogik und Anwendungslogik zu gewährleisten. Darüber hinaus werden so Namenskonflikte zwischen Testmethoden und Anwendungsmethoden vermieden.

Frage 5: Wozu dienen die Äquivalenzklassen im Blackbox-Test?

Antwort: Äquivalenzklassen dienen der Strukturierung und Erstellung von Gruppen von Eingabedaten, welche das gleiche Verhalten des Systems hervorrufen sollen. Äquivalenzklassen werden verwendet um die Anzahl der Testfälle zu reduzieren, indem nur jeweils ein „Stellvertreter-Wert“ aus jeder Klasse getestet wird, anstatt alle möglichen Werte. 

Frage 6: Warum lässt sich für die Klasse Client nicht ohne weiteres ein
Blackbox-Test umsetzen?
