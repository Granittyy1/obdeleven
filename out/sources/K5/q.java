package K5;

import android.content.SharedPreferences;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bo.app.F0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4360c;

    public /* synthetic */ q(int i10, Object obj) {
        this.f4359b = i10;
        this.f4360c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4359b) {
            case 0:
                View view = (View) this.f4360c;
                ((InputMethodManager) p0.a.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                String str = (String) this.f4360c;
                if (!p005a4.v.f8052d.get()) {
                    p005a4.v.f8049a.a();
                }
                SharedPreferences sharedPreferences = p005a4.v.f8051c;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", str).apply();
                    return;
                } else {
                    kotlin.jvm.internal.i.m("sharedPreferences");
                    throw null;
                }
            case 2:
                Runnable onContinue = (Runnable) this.f4360c;
                kotlin.jvm.internal.i.e(onContinue, "$onContinue");
                onContinue.run();
                return;
            case 3:
                ((p128k2.j) this.f4360c).f41509m.start();
                return;
            case 4:
                p182o9.c cVar = (p182o9.c) this.f4360c;
                cVar.f32003t.f2190s.j(new p182o9.b(cVar));
                ((p109i8.i) cVar.f31997n).m(new F0(3, cVar));
                return;
            default:
                p297y1.d.this.f48033h.c();
                return;
        }
    }
}
