package org.simpleframework.xml.core;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
class Collector implements Criteria {
    private final Registry alias;
    private final Registry registry;

    public static class Registry extends LinkedHashMap<Object, Variable> {
        public /* synthetic */ Registry(int i10) {
            this();
        }

        public Iterator<Object> iterator() {
            return keySet().iterator();
        }

        private Registry() {
        }
    }

    public Collector() {
        int i10 = 0;
        this.registry = new Registry(i10);
        this.alias = new Registry(i10);
    }

    @Override // org.simpleframework.xml.core.Criteria
    public void commit(Object obj) throws Exception {
        for (Variable variable : this.registry.values()) {
            variable.getContact().set(obj, variable.getValue());
        }
    }

    @Override // org.simpleframework.xml.core.Criteria
    public Variable get(Object obj) {
        return this.registry.get(obj);
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.registry.iterator();
    }

    @Override // org.simpleframework.xml.core.Criteria
    public Variable remove(Object obj) throws Exception {
        return this.registry.remove(obj);
    }

    @Override // org.simpleframework.xml.core.Criteria
    public Variable resolve(String str) {
        return this.alias.get(str);
    }

    @Override // org.simpleframework.xml.core.Criteria
    public void set(Label label, Object obj) throws Exception {
        Variable variable = new Variable(label, obj);
        if (label != null) {
            String[] paths = label.getPaths();
            Object key = label.getKey();
            for (String str : paths) {
                this.alias.put(str, variable);
            }
            this.registry.put(key, variable);
        }
    }

    @Override // org.simpleframework.xml.core.Criteria
    public Variable get(Label label) throws Exception {
        if (label == null) {
            return null;
        }
        return this.registry.get(label.getKey());
    }
}
