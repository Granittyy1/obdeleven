package androidx.paging;

import com.google.android.gms.internal.measurement.M1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PageEvent.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class PageEvent<T> {

    /* JADX INFO: compiled from: PageEvent.kt */
    public static final class Insert<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Insert<Object> f19259g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoadType f19260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<F<T>> f19261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n f19264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final n f19265f;

        /* JADX INFO: compiled from: PageEvent.kt */
        public static final class a {
            public static Insert a(List pages, int i10, int i11, n sourceLoadStates, n nVar) {
                kotlin.jvm.internal.i.e(pages, "pages");
                kotlin.jvm.internal.i.e(sourceLoadStates, "sourceLoadStates");
                return new Insert(LoadType.f19252b, pages, i10, i11, sourceLoadStates, nVar);
            }
        }

        static {
            List listK = M1.k(F.f19230d);
            m.c cVar = m.c.f19374c;
            m.c cVar2 = m.c.f19373b;
            f19259g = a.a(listK, 0, 0, new n(cVar, cVar2, cVar2), null);
        }

        public Insert(LoadType loadType, List<F<T>> list, int i10, int i11, n nVar, n nVar2) {
            this.f19260a = loadType;
            this.f19261b = list;
            this.f19262c = i10;
            this.f19263d = i11;
            this.f19264e = nVar;
            this.f19265f = nVar2;
            if (loadType != LoadType.f19254d && i10 < 0) {
                throw new IllegalArgumentException(J4.i.b(i10, "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
            }
            if (loadType != LoadType.f19253c && i11 < 0) {
                throw new IllegalArgumentException(J4.i.b(i11, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
            }
            if (loadType == LoadType.f19252b && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0097  */
        /* JADX WARN: Code duplicated, block: B:20:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:22:0x00df A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:25:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0097 -> B:18:0x00b6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e0 -> B:24:0x00e7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        public final <R> java.lang.Object a(Ia.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends java.lang.Object> r20, kotlin.coroutines.c<? super androidx.paging.PageEvent<R>> r21) {
            /*
                Method dump skipped, instruction units count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.a(Ia.p, kotlin.coroutines.c):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return this.f19260a == insert.f19260a && kotlin.jvm.internal.i.a(this.f19261b, insert.f19261b) && this.f19262c == insert.f19262c && this.f19263d == insert.f19263d && kotlin.jvm.internal.i.a(this.f19264e, insert.f19264e) && kotlin.jvm.internal.i.a(this.f19265f, insert.f19265f);
        }

        public final int hashCode() {
            int iHashCode = (this.f19264e.hashCode() + p005a4.q.b(this.f19263d, p005a4.q.b(this.f19262c, p005a4.p.d(this.f19260a.hashCode() * 31, 31, this.f19261b), 31), 31)) * 31;
            n nVar = this.f19265f;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }

        public final String toString() {
            List<T> list;
            List<T> list2;
            List<F<T>> list3 = this.f19261b;
            Iterator<T> it = list3.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((F) it.next()).f19232b.size();
            }
            int i10 = this.f19262c;
            String strValueOf = i10 != -1 ? String.valueOf(i10) : "none";
            int i11 = this.f19263d;
            String strValueOf2 = i11 != -1 ? String.valueOf(i11) : "none";
            StringBuilder sb2 = new StringBuilder("PageEvent.Insert for ");
            sb2.append(this.f19260a);
            sb2.append(", with ");
            sb2.append(size);
            sb2.append(" items (\n                    |   first item: ");
            F f10 = (F) kotlin.collections.q.P(list3);
            Object objW = null;
            sb2.append((f10 == null || (list2 = f10.f19232b) == null) ? null : kotlin.collections.q.P(list2));
            sb2.append("\n                    |   last item: ");
            F f11 = (F) kotlin.collections.q.W(list3);
            if (f11 != null && (list = f11.f19232b) != null) {
                objW = kotlin.collections.q.W(list);
            }
            sb2.append(objW);
            sb2.append("\n                    |   placeholdersBefore: ");
            sb2.append(strValueOf);
            sb2.append("\n                    |   placeholdersAfter: ");
            sb2.append(strValueOf2);
            sb2.append("\n                    |   sourceLoadStates: ");
            sb2.append(this.f19264e);
            sb2.append("\n                    ");
            String string = sb2.toString();
            n nVar = this.f19265f;
            if (nVar != null) {
                string = string + "|   mediatorLoadStates: " + nVar + '\n';
            }
            return kotlin.text.i.w(string + "|)");
        }
    }

    /* JADX INFO: compiled from: PageEvent.kt */
    public static final class StaticList<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f19266a;

        public StaticList(List data) {
            kotlin.jvm.internal.i.e(data, "data");
            this.f19266a = data;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0066  */
        /* JADX WARN: Code duplicated, block: B:19:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x007d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:21:0x0080). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        public final <R> java.lang.Object a(Ia.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends java.lang.Object> r9, kotlin.coroutines.c<? super androidx.paging.PageEvent<R>> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof androidx.paging.PageEvent$StaticList$map$1
                if (r0 == 0) goto L13
                r0 = r10
                androidx.paging.PageEvent$StaticList$map$1 r0 = (androidx.paging.PageEvent$StaticList$map$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L1a
            L13:
                androidx.paging.PageEvent$StaticList$map$1 r0 = new androidx.paging.PageEvent$StaticList$map$1
                kotlin.coroutines.jvm.internal.ContinuationImpl r10 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r10
                r0.<init>(r8, r10)
            L1a:
                java.lang.Object r10 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L45
                if (r2 != r3) goto L3d
                java.lang.Object r9 = r0.L$4
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.Object r2 = r0.L$3
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.L$2
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r0.L$1
                Ia.p r5 = (Ia.p) r5
                java.lang.Object r6 = r0.L$0
                androidx.paging.PageEvent$StaticList r6 = (androidx.paging.PageEvent.StaticList) r6
                kotlin.b.b(r10)
                goto L80
            L3d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L45:
                kotlin.b.b(r10)
                java.util.List<T> r10 = r8.f19266a
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = kotlin.collections.m.y(r10, r4)
                r2.<init>(r4)
                java.util.Iterator r10 = r10.iterator()
                r6 = r8
                r7 = r10
                r10 = r9
                r9 = r2
                r2 = r7
            L60:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L86
                java.lang.Object r4 = r2.next()
                r0.L$0 = r6
                r0.L$1 = r10
                r0.L$2 = r9
                r0.L$3 = r2
                r0.L$4 = r9
                r0.label = r3
                java.lang.Object r4 = r10.invoke(r4, r0)
                if (r4 != r1) goto L7d
                return r1
            L7d:
                r5 = r10
                r10 = r4
                r4 = r9
            L80:
                r9.add(r10)
                r9 = r4
                r10 = r5
                goto L60
            L86:
                java.util.List r9 = (java.util.List) r9
                r6.getClass()
                androidx.paging.PageEvent$StaticList r10 = new androidx.paging.PageEvent$StaticList
                r10.<init>(r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.a(Ia.p, kotlin.coroutines.c):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StaticList) {
                return kotlin.jvm.internal.i.a(this.f19266a, ((StaticList) obj).f19266a) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(null, null);
            }
            return false;
        }

        public final int hashCode() {
            return this.f19266a.hashCode() * 961;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PageEvent.StaticList with ");
            List<T> list = this.f19266a;
            sb2.append(list.size());
            sb2.append(" items (\n                    |   first item: ");
            sb2.append(kotlin.collections.q.P(list));
            sb2.append("\n                    |   last item: ");
            sb2.append(kotlin.collections.q.W(list));
            sb2.append("\n                    |   sourceLoadStates: null\n                    ");
            return kotlin.text.i.w(sb2.toString() + "|)");
        }
    }

    /* JADX INFO: compiled from: PageEvent.kt */
    public static final class a<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoadType f19267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19270d;

        public a(LoadType loadType, int i10, int i11, int i12) {
            kotlin.jvm.internal.i.e(loadType, "loadType");
            this.f19267a = loadType;
            this.f19268b = i10;
            this.f19269c = i11;
            this.f19270d = i12;
            if (loadType == LoadType.f19252b) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if (b() > 0) {
                if (i12 < 0) {
                    throw new IllegalArgumentException(J4.i.b(i12, "Invalid placeholdersRemaining ").toString());
                }
            } else {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + b()).toString());
            }
        }

        public final int b() {
            return (this.f19269c - this.f19268b) + 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19267a == aVar.f19267a && this.f19268b == aVar.f19268b && this.f19269c == aVar.f19269c && this.f19270d == aVar.f19270d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f19270d) + p005a4.q.b(this.f19269c, p005a4.q.b(this.f19268b, this.f19267a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            String str;
            int iOrdinal = this.f19267a.ordinal();
            if (iOrdinal == 1) {
                str = "front";
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "end";
            }
            StringBuilder sbA = C7.g.a("PageEvent.Drop from the ", str, " (\n                    |   minPageOffset: ");
            sbA.append(this.f19268b);
            sbA.append("\n                    |   maxPageOffset: ");
            sbA.append(this.f19269c);
            sbA.append("\n                    |   placeholdersRemaining: ");
            sbA.append(this.f19270d);
            sbA.append("\n                    |)");
            return kotlin.text.i.w(sbA.toString());
        }
    }

    /* JADX INFO: compiled from: PageEvent.kt */
    public static final class b<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f19271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f19272b;

        public b(n source, n nVar) {
            kotlin.jvm.internal.i.e(source, "source");
            this.f19271a = source;
            this.f19272b = nVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.i.a(this.f19271a, bVar.f19271a) && kotlin.jvm.internal.i.a(this.f19272b, bVar.f19272b);
        }

        public final int hashCode() {
            int iHashCode = this.f19271a.hashCode() * 31;
            n nVar = this.f19272b;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }

        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f19271a + "\n                    ";
            n nVar = this.f19272b;
            if (nVar != null) {
                str = str + "|   mediatorLoadStates: " + nVar + '\n';
            }
            return kotlin.text.i.w(str + "|)");
        }
    }

    public <R> Object a(Ia.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super PageEvent<R>> cVar) {
        return this;
    }
}
