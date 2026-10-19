package com.voltasit.obdeleven.utils;

import G8.C0706h;
import V8.l;
import android.os.Bundle;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p220r9.r;
import p255u9.z;

/* JADX INFO: compiled from: CreditUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CreditUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f34225a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f34226b = new ArrayList();

    /* JADX INFO: compiled from: CreditUtils.kt */
    public static final class CreditsException extends Exception {
        private final int code;

        public CreditsException() {
            super("Not logged in");
            this.code = 15;
        }
    }

    /* JADX INFO: compiled from: CreditUtils.kt */
    public interface a {
        void m(int i10);
    }

    public static T a(List availableProducts, BaseFragment fragment) {
        i.e(availableProducts, "availableProducts");
        i.e(fragment, "fragment");
        ArrayList arrayList = f34226b;
        arrayList.clear();
        if (availableProducts.isEmpty()) {
            return null;
        }
        arrayList.addAll(q.h0(availableProducts, new r()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0706h) it.next()).f3498a);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_title", R.string.common_credits_purchase);
        bundle.putStringArray("item_array", (String[]) arrayList2.toArray(new String[0]));
        bundle.putString("key_tag", "buyCreditsDialog");
        bundle.putInt("key_positive_text", R.string.common_ok);
        T t8 = new T();
        t8.setArguments(bundle);
        t8.f32261r = fragment.getFragmentManager();
        t8.setTargetFragment(fragment, 0);
        return t8;
    }

    public static final void b(z userDB) {
        i.e(userDB, "userDB");
        i.d(userDB.fetchInBackground().continueWith(new l(8, userDB), Task.UI_THREAD_EXECUTOR), "continueWith(...)");
    }
}
