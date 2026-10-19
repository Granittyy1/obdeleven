package org.koin.core.definition;

import Ia.l;
import Ia.p;
import Pb.b;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import org.koin.core.scope.a;

/* JADX INFO: compiled from: BeanDefinition.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BeanDefinition<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f45754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f45755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<a, Ob.a, T> f45756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Kind f45757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f45758e;

    public BeanDefinition(b scopeQualifier, c cVar, p definition, Kind kind, EmptyList secondaryTypes) {
        i.e(scopeQualifier, "scopeQualifier");
        i.e(definition, "definition");
        i.e(secondaryTypes, "secondaryTypes");
        this.f45754a = scopeQualifier;
        this.f45755b = cVar;
        this.f45756c = definition;
        this.f45757d = kind;
        this.f45758e = secondaryTypes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i.c(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        BeanDefinition beanDefinition = (BeanDefinition) obj;
        return this.f45755b.equals(beanDefinition.f45755b) && i.a(null, null) && i.a(this.f45754a, beanDefinition.f45754a);
    }

    public final int hashCode() {
        return this.f45754a.hashCode() + (this.f45755b.hashCode() * 31);
    }

    public final String toString() {
        String str;
        String string = this.f45757d.toString();
        String str2 = "'" + Sb.a.a(this.f45755b) + '\'';
        b bVar = this.f45754a;
        if (i.a(bVar, Qb.b.f5141c)) {
            str = "";
        } else {
            str = ",scope:" + bVar;
        }
        return "[" + string + ':' + str2 + "" + str + (!((Collection) this.f45758e).isEmpty() ? ",binds:".concat(q.U((Iterable) this.f45758e, ",", null, null, new l<Oa.c<?>, CharSequence>() { // from class: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1
            @Override // Ia.l
            public final CharSequence invoke(Oa.c<?> cVar) {
                Oa.c<?> it = cVar;
                i.e(it, "it");
                return Sb.a.a(it);
            }
        }, 30)) : "") + ']';
    }
}
