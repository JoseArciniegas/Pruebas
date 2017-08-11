permutacion([], []).
permutacion([H|T], L) :-
    permutacion(T, L1),
    select(H, L, L1).
