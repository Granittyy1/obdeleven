package com.voltasit.obdeleven.domain.exceptions;

import B6.c;
import F8.a;

/* JADX INFO: compiled from: WrongCuIDException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class WrongCuIDException extends Throwable {
    public WrongCuIDException(short s10, short s11) {
        super(c.d("Maximum id: ", a.l(s10), " current id: ", a.l(s11)));
    }
}
