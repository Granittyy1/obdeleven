package kotlinx.datetime.internal.format.parser;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: ParserOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g<Output> implements k<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e<Output>> f43912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43914c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends e<? super Output>> list) {
        boolean z10;
        boolean z11;
        int i10;
        this.f43912a = list;
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer numB = ((e) it.next()).b();
            if (numB != null) {
                iIntValue = numB.intValue();
            }
            i11 += iIntValue;
        }
        this.f43913b = i11;
        List<e<Output>> list2 = this.f43912a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = false;
                    break;
                } else if (((e) it2.next()).b() == null) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        this.f43914c = z10;
        List<e<Output>> list3 = this.f43912a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z11 = true;
                    break;
                }
                Integer numB2 = ((e) it3.next()).b();
                if (!((numB2 != null ? numB2.intValue() : BrazeLogger.SUPPRESS) > 0)) {
                    z11 = false;
                    break;
                }
            }
        } else {
            z11 = true;
            break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<e<Output>> list4 = this.f43912a;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it4 = list4.iterator();
            i10 = 0;
            while (it4.hasNext()) {
                if ((((e) it4.next()).b() == null) && (i10 = i10 + 1) < 0) {
                    kotlin.collections.l.w();
                    throw null;
                }
            }
        }
        if (!(i10 <= 1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.datetime.internal.format.parser.k
    public final Object a(c cVar, String input, int i10) {
        kotlin.jvm.internal.i.e(input, "input");
        int i11 = this.f43913b;
        if (i10 + i11 > input.length()) {
            return new h(i10, new Ia.a<String>(this) { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$consume$1
                final /* synthetic */ g<Object> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Unexpected end of input: yet to parse " + this.this$0.b();
                }
            });
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        while (ref$IntRef.element + i10 < input.length() && Character.isDigit(input.charAt(ref$IntRef.element + i10))) {
            ref$IntRef.element++;
        }
        if (ref$IntRef.element < i11) {
            return new h(i10, new Ia.a<String>() { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$consume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Only found " + ref$IntRef.element + " digits in a row, but need to parse " + this.b();
                }
            });
        }
        List<e<Output>> list = this.f43912a;
        int size = list.size();
        final int i12 = 0;
        while (i12 < size) {
            Integer numB = list.get(i12).b();
            int iIntValue = (numB != null ? numB.intValue() : (ref$IntRef.element - i11) + 1) + i10;
            final String string = input.subSequence(i10, iIntValue).toString();
            final f fVarA = list.get(i12).a(cVar, string);
            if (fVarA != null) {
                return new h(i10, new Ia.a<String>() { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$consume$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Can not interpret the string '" + string + "' as " + this.f43912a.get(i12).f43906b + ": " + fVarA.a();
                    }
                });
            }
            i12++;
            i10 = iIntValue;
        }
        return Integer.valueOf(i10);
    }

    public final String b() {
        String str;
        List<e<Output>> list = this.f43912a;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            StringBuilder sb2 = new StringBuilder();
            Integer numB = eVar.b();
            if (numB == null) {
                str = "at least one digit";
            } else {
                str = numB + " digits";
            }
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(eVar.f43906b);
            arrayList.add(sb2.toString());
        }
        boolean z10 = this.f43914c;
        int i10 = this.f43913b;
        if (z10) {
            return "a number with at least " + i10 + " digits: " + arrayList;
        }
        return "a number with exactly " + i10 + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
