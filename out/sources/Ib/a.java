package Ib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.instance.c;
import org.koin.core.logger.Level;
import p293xa.r;

/* JADX INFO: compiled from: Koin.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qb.b f3935a = new Qb.b(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qb.a f3936b = new Qb.a(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E3.b f3937c;

    public a() {
        new ConcurrentHashMap();
        new HashMap();
        this.f3937c = new Mb.a(Level.f45772f);
    }

    public final void a() {
        this.f3937c.g("Create eager instances ...");
        long jNanoTime = System.nanoTime();
        Qb.a aVar = this.f3936b;
        HashMap<Integer, SingleInstanceFactory<?>> map = aVar.f5140c;
        Collection<SingleInstanceFactory<?>> collectionValues = map.values();
        i.d(collectionValues, "<get-values>(...)");
        SingleInstanceFactory[] singleInstanceFactoryArr = (SingleInstanceFactory[]) collectionValues.toArray(new SingleInstanceFactory[0]);
        ArrayList arrayListN = l.n(Arrays.copyOf(singleInstanceFactoryArr, singleInstanceFactoryArr.length));
        map.clear();
        a aVar2 = aVar.f5138a;
        org.koin.core.instance.b bVar = new org.koin.core.instance.b(aVar2.f3937c, aVar2.f3935a.f5143b, null);
        Iterator it = arrayListN.iterator();
        while (it.hasNext()) {
            ((SingleInstanceFactory) it.next()).b(bVar);
        }
        double dDoubleValue = ((Number) new Pair(r.f47939a, Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d)).d()).doubleValue();
        this.f3937c.g("Created eager instances in " + dDoubleValue + " ms");
    }

    public final void b(List<Nb.a> list, boolean z10, boolean z11) {
        LinkedHashSet<Nb.a> linkedHashSet = new LinkedHashSet();
        Nb.b.a(list, linkedHashSet);
        Qb.a aVar = this.f3936b;
        aVar.getClass();
        for (Nb.a aVar2 : linkedHashSet) {
            for (Map.Entry<String, c<?>> entry : aVar2.f4705d.entrySet()) {
                String mapping = entry.getKey();
                c<?> factory = entry.getValue();
                i.e(mapping, "mapping");
                i.e(factory, "factory");
                ConcurrentHashMap concurrentHashMap = aVar.f5139b;
                boolean zContainsKey = concurrentHashMap.containsKey(mapping);
                BeanDefinition<?> beanDefinition = factory.f45767a;
                a aVar3 = aVar.f5138a;
                if (zContainsKey) {
                    if (!z10) {
                        String msg = "Already existing definition for " + beanDefinition + " at " + mapping;
                        i.e(msg, "msg");
                        throw new DefinitionOverrideException(msg);
                    }
                    E3.b bVar = aVar3.f3937c;
                    String msg2 = "(+) override index '" + mapping + "' -> '" + beanDefinition + '\'';
                    bVar.getClass();
                    i.e(msg2, "msg");
                    bVar.E(Level.f45770d, msg2);
                }
                aVar3.f3937c.g("(+) index '" + mapping + "' -> '" + beanDefinition + '\'');
                concurrentHashMap.put(mapping, factory);
            }
            for (SingleInstanceFactory<?> singleInstanceFactory : aVar2.f4704c) {
                aVar.f5140c.put(Integer.valueOf(singleInstanceFactory.f45767a.hashCode()), singleInstanceFactory);
            }
        }
        Qb.b bVar2 = this.f3935a;
        bVar2.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            bVar2.f5142a.addAll(((Nb.a) it.next()).f4706e);
        }
        if (z11) {
            a();
        }
    }
}
