package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.ArrayList;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0456a f40335a = new C0456a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.ktor.util.a<a> f40336b = new io.ktor.util.a<>("BodyProgress");

    /* JADX INFO: renamed from: io.ktor.client.plugins.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BodyProgress.kt */
    public static final class C0456a implements i<p293xa.r, a> {
        @Override // io.ktor.client.plugins.i
        public final void a(a aVar, HttpClient scope) throws InvalidPhaseException {
            io.ktor.util.pipeline.e eVar;
            P3.b bVar;
            a plugin = aVar;
            kotlin.jvm.internal.i.e(plugin, "plugin");
            kotlin.jvm.internal.i.e(scope, "scope");
            P3.b bVar2 = new P3.b(2, "ObservableContent");
            V9.d dVar = scope.f40243f;
            dVar.getClass();
            P3.b reference = V9.d.f6859i;
            kotlin.jvm.internal.i.e(reference, "reference");
            if (!dVar.e(bVar2)) {
                int iC = dVar.c(reference);
                if (iC == -1) {
                    throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
                }
                int i10 = iC + 1;
                ArrayList arrayList = dVar.f40557a;
                int iR = kotlin.collections.l.r(arrayList);
                if (i10 <= iR) {
                    while (true) {
                        Object obj = arrayList.get(i10);
                        io.ktor.util.pipeline.a aVar2 = obj instanceof io.ktor.util.pipeline.a ? (io.ktor.util.pipeline.a) obj : null;
                        if (aVar2 != null && (eVar = aVar2.f40554b) != null) {
                            io.ktor.util.pipeline.e.a aVar3 = eVar instanceof io.ktor.util.pipeline.e.a ? (io.ktor.util.pipeline.e.a) eVar : null;
                            if (aVar3 != null && (bVar = aVar3.f40563a) != null && bVar.equals(reference)) {
                                iC = i10;
                            }
                            if (i10 == iR) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList.add(iC + 1, new io.ktor.util.pipeline.a(bVar2, new io.ktor.util.pipeline.e.a(reference)));
            }
            dVar.f(bVar2, new BodyProgress$handle$1(3, null));
            scope.f40246i.f(io.ktor.client.statement.b.f40426h, new BodyProgress$handle$2(3, null));
        }

        @Override // io.ktor.client.plugins.i
        public final a b(Ia.l<? super p293xa.r, p293xa.r> lVar) {
            return new a();
        }

        @Override // io.ktor.client.plugins.i
        public final io.ktor.util.a<a> getKey() {
            return a.f40336b;
        }
    }
}
