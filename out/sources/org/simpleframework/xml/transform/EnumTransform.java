package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class EnumTransform implements Transform<Enum> {
    private final Class type;

    public EnumTransform(Class cls) {
        this.type = cls;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Enum read(String str) throws Exception {
        return Enum.valueOf(this.type, str.replaceAll("-", "_"));
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Enum r10) throws Exception {
        return r10.name();
    }
}
