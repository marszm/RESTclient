# RESTclient
REST client with scheduler.
Korzystając z publicznego REST API: https://jsonplaceholder.typicode.com napisz aplikację klienta, która będzie pobierać listę osób (users) wraz ich zadaniami do wykonania (todos). Aplikacja powinna pobierać i wypisywać pobrane dane cyklicznie co 5 sekund.

Aplikacja powinna być odporna na błędy połączenia z API.

Pobrane dane powinny być wydrukowane w następującej postaci:

User #{id} ({userName})
    [*] task: {title}
    [ ] task: {title}
...
Przykład:

User #7 (Elwyn.Skiles)
    [*] task: inventore aut nihil minima laudantium hic qui omnis
    [*] task: provident aut nobis culpa
    [ ] task: esse et quis iste est earum aut impedit
    [ ] task: qui consectetur id
    [ ] task: aut quasi autem iste tempore illum possimus
