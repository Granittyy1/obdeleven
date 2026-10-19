package kotlinx.datetime.internal.format;

import com.google.android.gms.internal.measurement.M1;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: FieldFormatDirective.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ReducedIntFieldDirective<Target> implements k<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f43868a;

    public ReducedIntFieldDirective(o field) {
        kotlin.jvm.internal.i.e(field, "field");
        this.f43868a = field;
    }

    @Override // kotlinx.datetime.internal.format.k
    public final Wa.e<Target> a() {
        return new Wa.f(new ReducedIntFieldDirective$formatter$1(1, this.f43868a.f43891a, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0));
    }

    @Override // kotlinx.datetime.internal.format.k
    public final kotlinx.datetime.internal.format.parser.l<Target> b() {
        o oVar = this.f43868a;
        r setter = oVar.f43891a;
        kotlin.jvm.internal.i.e(setter, "setter");
        String name = oVar.f43892b;
        kotlin.jvm.internal.i.e(name, "name");
        EmptyList emptyList = EmptyList.f42983b;
        return new kotlinx.datetime.internal.format.parser.l<>(emptyList, kotlin.collections.l.s(new kotlinx.datetime.internal.format.parser.l(M1.k(new kotlinx.datetime.internal.format.parser.g(M1.k(new kotlinx.datetime.internal.format.parser.n(setter, name)))), emptyList), new kotlinx.datetime.internal.format.parser.l(kotlin.collections.l.s(new kotlinx.datetime.internal.format.parser.m("+"), new kotlinx.datetime.internal.format.parser.g(M1.k(new kotlinx.datetime.internal.format.parser.q(null, null, setter, name, false)))), emptyList), new kotlinx.datetime.internal.format.parser.l(kotlin.collections.l.s(new kotlinx.datetime.internal.format.parser.m("-"), new kotlinx.datetime.internal.format.parser.g(M1.k(new kotlinx.datetime.internal.format.parser.q(null, null, setter, name, true)))), emptyList)));
    }

    @Override // kotlinx.datetime.internal.format.k
    public final m<Target, Integer> c() {
        return this.f43868a;
    }
}
