package io.intercom.android.sdk.utilities.commons;

import B8.E0;

/* JADX INFO: loaded from: classes.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM = new E0(1);

    long currentTimeMillis();
}
