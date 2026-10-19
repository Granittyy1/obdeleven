package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TopicsStore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference<N> f28305b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J f28306a;

    public final synchronized M a() {
        String strPeek;
        M m7;
        J j = this.f28306a;
        synchronized (j.f28288d) {
            strPeek = j.f28288d.peek();
        }
        Pattern pattern = M.f28301d;
        m7 = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                m7 = new M(strArrSplit[0], strArrSplit[1]);
            }
        }
        return m7;
    }
}
