package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.X;
import androidx.core.view.C1298m;
import androidx.lifecycle.C1378v;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public class k extends Activity implements InterfaceC1376t, C1298m.a {
    private final X<Class<? extends a>, a> extraDataMap = new X<>();
    private final C1378v lifecycleRegistry = new C1378v(this);

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @p293xa.d
    public static class a {
    }

    private final boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (C1298m.a(decorView, event)) {
            return true;
        }
        return C1298m.b(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (C1298m.a(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @p293xa.d
    public <T extends a> T getExtraData(Class<T> extraDataClass) {
        kotlin.jvm.internal.i.e(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = androidx.lifecycle.J.f17740c;
        androidx.lifecycle.J.a.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        this.lifecycleRegistry.h(Lifecycle.State.f17751d);
        super.onSaveInstanceState(outState);
    }

    @p293xa.d
    public void putExtraData(a extraData) {
        kotlin.jvm.internal.i.e(extraData, "extraData");
        this.extraDataMap.put(a.class, extraData);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // androidx.core.view.C1298m.a
    public boolean superDispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }
}
