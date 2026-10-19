package p068f4;

import Z3.q;
import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Context contextA = q.a();
        HashMap<String, Method> map = j.f34977a;
        ArrayList arrayListA = j.a(j.d(contextA, e.f34946i, "inapp"));
        e eVar = e.f34938a;
        e.a(eVar, contextA, arrayListA, false);
        e.a(eVar, contextA, j.a(j.d(contextA, e.f34946i, "subs")), true);
    }
}
