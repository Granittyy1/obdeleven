package p248u2;

import B7.b;
import android.os.Bundle;
import androidx.compose.foundation.gestures.d;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import p271w0.c;

/* JADX INFO: compiled from: Recreator.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f47412b;

    /* JADX INFO: renamed from: u2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Recreator.android.kt */
    public static final class C0539a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f47413a;

        public C0539a(c registry) {
            i.e(registry, "registry");
            this.f47413a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // u2.c.b
        public final Bundle a() {
            y.p();
            Bundle bundleB = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            f.e(bundleB, "classes_to_restore", q.o0(this.f47413a));
            return bundleB;
        }
    }

    public a(e owner) {
        i.e(owner, "owner");
        this.f47412b = owner;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1376t.getLifecycle().c(this);
        e eVar = this.f47412b;
        Bundle bundleA = eVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(c.a.class);
                i.b(clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        i.b(objNewInstance);
                        ((c.a) objNewInstance).a(eVar);
                    } catch (Exception e10) {
                        throw new RuntimeException(b.c("Failed to instantiate ", str), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(d.b("Class ", str, " wasn't found"), e12);
            }
        }
    }
}
