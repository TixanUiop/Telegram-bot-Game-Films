package org.evgeny.mapper;

public interface IMapper<F, T> {
    T map(F from);
}
