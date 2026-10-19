package com.google.android.datatransport.cct;

import D4.c;
import D4.f;
import D4.k;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements c {
    @Override // D4.c
    public k create(f fVar) {
        return new A4.c(fVar.a(), fVar.d(), fVar.c());
    }
}
