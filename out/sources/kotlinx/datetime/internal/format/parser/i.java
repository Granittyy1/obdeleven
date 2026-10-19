package kotlinx.datetime.internal.format.parser;

import D2.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.datetime.internal.format.parser.c;

/* JADX INFO: compiled from: Parser.kt */
/* JADX INFO: loaded from: classes2.dex */
@Ha.a
public final class i<Output extends c<Output>> {

    /* JADX INFO: compiled from: Parser.kt */
    public static final class a<Output> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f43917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<Output> f43918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43919c;

        public a(c cVar, l parserStructure, int i10) {
            kotlin.jvm.internal.i.e(parserStructure, "parserStructure");
            this.f43917a = cVar;
            this.f43918b = parserStructure;
            this.f43919c = i10;
        }
    }

    public static c a(l lVar, String input, c initialContainer) throws ParseException {
        kotlin.jvm.internal.i.e(input, "input");
        kotlin.jvm.internal.i.e(initialContainer, "initialContainer");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListT = kotlin.collections.l.t(new a(initialContainer, lVar, 0));
        while (true) {
            a aVar = (a) (arrayListT.isEmpty() ? null : arrayListT.remove(kotlin.collections.l.r(arrayListT)));
            if (aVar != null) {
                c cVar = (c) aVar.f43917a.d();
                l<Output> lVar2 = aVar.f43918b;
                int size = lVar2.f43920a.size();
                int iIntValue = aVar.f43919c;
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        List<l<Output>> list = lVar2.f43921b;
                        if (!list.isEmpty()) {
                            int size2 = list.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i11 = size2 - 1;
                                arrayListT.add(new a(cVar, (l) list.get(size2), iIntValue));
                                if (i11 < 0) {
                                    break;
                                }
                                size2 = i11;
                            }
                        } else {
                            if (iIntValue != input.length()) {
                                arrayList.add(new h(iIntValue, new Ia.a<String>() { // from class: kotlinx.datetime.internal.format.parser.Parser$parse$1$3
                                    @Override // Ia.a
                                    public final /* bridge */ /* synthetic */ String invoke() {
                                        return "There is more input to consume";
                                    }
                                }));
                                break;
                            }
                            return cVar;
                        }
                    } else {
                        Object objA = ((k) lVar2.f43920a.get(i10)).a(cVar, input, iIntValue);
                        if (!(objA instanceof Integer)) {
                            if (objA instanceof h) {
                                arrayList.add((h) objA);
                                break;
                            }
                            throw new IllegalStateException(("Unexpected parse result: " + objA).toString());
                        }
                        iIntValue = ((Number) objA).intValue();
                        i10++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    kotlin.collections.p.G(arrayList, new j());
                }
                ParseException parseException = new ParseException((h) kotlin.collections.q.O(arrayList));
                Iterator it = kotlin.collections.q.K(arrayList, 1).iterator();
                while (it.hasNext()) {
                    V.e(parseException, new ParseException((h) it.next()));
                }
                throw parseException;
            }
        }
    }
}
