package Nb;

import androidx.compose.animation.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.i;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.instance.c;

/* JADX INFO: compiled from: Module.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<SingleInstanceFactory<?>> f4704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, c<?>> f4705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet<Pb.a> f4706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f4707f;

    public a(boolean z10) {
        this.f4702a = z10;
        this.f4703b = D.c("toString(...)");
        this.f4704c = new HashSet<>();
        this.f4705d = new HashMap<>();
        this.f4706e = new HashSet<>();
        this.f4707f = new ArrayList();
    }

    public final boolean a() {
        return this.f4702a;
    }

    public final void b(c<?> cVar) {
        BeanDefinition<?> beanDefinition = cVar.f45767a;
        String mapping = Lb.a.i(beanDefinition.f45755b, null, beanDefinition.f45754a);
        i.e(mapping, "mapping");
        this.f4705d.put(mapping, cVar);
    }

    public final void c(SingleInstanceFactory<?> singleInstanceFactory) {
        this.f4704c.add(singleInstanceFactory);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && i.a(this.f4703b, ((a) obj).f4703b);
    }

    public final int hashCode() {
        return this.f4703b.hashCode();
    }

    public a() {
        this(false);
    }
}
