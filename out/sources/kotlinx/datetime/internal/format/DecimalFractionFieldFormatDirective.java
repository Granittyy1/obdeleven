package kotlinx.datetime.internal.format;

import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: FieldFormatDirective.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DecimalFractionFieldFormatDirective<Target> implements k<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f43855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f43858d;

    public DecimalFractionFieldFormatDirective(o field, int i10, int i11, List list) {
        kotlin.jvm.internal.i.e(field, "field");
        this.f43855a = field;
        this.f43856b = i10;
        this.f43857c = i11;
        this.f43858d = list;
    }

    @Override // kotlinx.datetime.internal.format.k
    public final Wa.e<Target> a() {
        return new Wa.d(this.f43856b, this.f43857c, new DecimalFractionFieldFormatDirective$formatter$1(1, this.f43855a.f43891a, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0), this.f43858d);
    }

    @Override // kotlinx.datetime.internal.format.k
    public final kotlinx.datetime.internal.format.parser.l<Target> b() {
        Integer numValueOf = Integer.valueOf(this.f43856b);
        Integer numValueOf2 = Integer.valueOf(this.f43857c);
        o oVar = this.f43855a;
        return new kotlinx.datetime.internal.format.parser.l<>(M1.k(new kotlinx.datetime.internal.format.parser.g(M1.k(new kotlinx.datetime.internal.format.parser.d(numValueOf, numValueOf2, oVar.f43891a, oVar.f43892b)))), EmptyList.f42983b);
    }

    @Override // kotlinx.datetime.internal.format.k
    public final m<Target, Va.a> c() {
        return this.f43855a;
    }
}
