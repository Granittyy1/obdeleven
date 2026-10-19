package kotlinx.datetime.internal.format;

import A1.C0575j;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.datetime.internal.format.parser.StringSetParserOperation;

/* JADX INFO: compiled from: FieldFormatDirective.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NamedUnsignedIntFieldFormatDirective<Target> implements k<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t<Target> f43859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f43860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43861c;

    /* JADX INFO: compiled from: FieldFormatDirective.kt */
    public final class a implements kotlinx.datetime.internal.format.parser.a<Target, String> {
        public a() {
        }

        @Override // kotlinx.datetime.internal.format.parser.a
        public final String c(Object obj, String str) {
            String newValue = str;
            kotlin.jvm.internal.i.e(newValue, "newValue");
            NamedUnsignedIntFieldFormatDirective<Target> namedUnsignedIntFieldFormatDirective = NamedUnsignedIntFieldFormatDirective.this;
            r rVar = namedUnsignedIntFieldFormatDirective.f43859a.f43936a;
            List<String> list = namedUnsignedIntFieldFormatDirective.f43860b;
            int iIndexOf = list.indexOf(newValue);
            t<Target> tVar = namedUnsignedIntFieldFormatDirective.f43859a;
            Integer num = (Integer) rVar.c(obj, Integer.valueOf(iIndexOf + tVar.f43937b));
            if (num != null) {
                return list.get(num.intValue() - tVar.f43937b);
            }
            return null;
        }

        @Override // kotlinx.datetime.internal.format.parser.a
        public final String getName() {
            return NamedUnsignedIntFieldFormatDirective.this.f43861c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NamedUnsignedIntFieldFormatDirective(t<? super Target> field, List<String> values, String str) {
        kotlin.jvm.internal.i.e(field, "field");
        kotlin.jvm.internal.i.e(values, "values");
        this.f43859a = field;
        this.f43860b = values;
        this.f43861c = str;
        int size = values.size();
        int i10 = (field.f43938c - field.f43937b) + 1;
        if (size == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("The number of values (");
        sb2.append(values.size());
        sb2.append(") in ");
        sb2.append(values);
        sb2.append(" does not match the range of the field (");
        throw new IllegalArgumentException(C0575j.b(sb2, i10, ')').toString());
    }

    @Override // kotlinx.datetime.internal.format.k
    public final Wa.e<Target> a() {
        return new Wa.j(new NamedUnsignedIntFieldFormatDirective$formatter$1(1, this, NamedUnsignedIntFieldFormatDirective.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0));
    }

    @Override // kotlinx.datetime.internal.format.k
    public final kotlinx.datetime.internal.format.parser.l<Target> b() {
        List<String> list = this.f43860b;
        return new kotlinx.datetime.internal.format.parser.l<>(M1.k(new StringSetParserOperation(list, new a(), "One of " + list + " for " + this.f43861c)), EmptyList.f42983b);
    }

    @Override // kotlinx.datetime.internal.format.k
    public final /* bridge */ /* synthetic */ m c() {
        return this.f43859a;
    }
}
