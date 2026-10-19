package kotlinx.datetime.internal.format;

import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: FieldFormatDirective.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SignedIntFieldFormatDirective<Target> implements k<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f43871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f43872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f43873c;

    public SignedIntFieldFormatDirective(o field, Integer num, Integer num2) {
        kotlin.jvm.internal.i.e(field, "field");
        this.f43871a = field;
        this.f43872b = num;
        this.f43873c = num2;
        if (num.intValue() >= 0) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
    }

    @Override // kotlinx.datetime.internal.format.k
    public final Wa.e<Target> a() {
        Wa.h hVar = new Wa.h(new SignedIntFieldFormatDirective$formatter$formatter$1(1, this.f43871a.f43891a, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0), this.f43872b.intValue());
        Integer num = this.f43873c;
        return num != null ? new Wa.i(hVar, num.intValue()) : hVar;
    }

    @Override // kotlinx.datetime.internal.format.k
    public final kotlinx.datetime.internal.format.parser.l<Target> b() {
        o oVar = this.f43871a;
        r setter = oVar.f43891a;
        kotlin.jvm.internal.i.e(setter, "setter");
        String name = oVar.f43892b;
        kotlin.jvm.internal.i.e(name, "name");
        Integer num = this.f43872b;
        Integer num2 = this.f43873c;
        ArrayList arrayListT = kotlin.collections.l.t(kotlin.jvm.internal.n.m(num, null, num2, setter, name, true));
        arrayListT.add(kotlin.jvm.internal.n.m(num, 4, num2, setter, name, false));
        List listS = kotlin.collections.l.s(new kotlinx.datetime.internal.format.parser.m("+"), new kotlinx.datetime.internal.format.parser.g(M1.k(new kotlinx.datetime.internal.format.parser.q(5, null, setter, name, false))));
        EmptyList emptyList = EmptyList.f42983b;
        arrayListT.add(new kotlinx.datetime.internal.format.parser.l(listS, emptyList));
        return new kotlinx.datetime.internal.format.parser.l<>(emptyList, arrayListT);
    }

    @Override // kotlinx.datetime.internal.format.k
    public final m<Target, Integer> c() {
        return this.f43871a;
    }
}
