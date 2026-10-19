package p139l0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ConstraintLayoutStates.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44109b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44110c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<C0503a> f44111d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.b> f44112e = new SparseArray<>();

    /* JADX INFO: renamed from: l0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    public static class C0503a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f44114b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f44116d;

        public C0503a(Context context, XmlResourceParser xmlResourceParser) {
            this.f44115c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f44140s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f44113a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44113a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44115c);
                    this.f44115c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f44116d = bVar;
                        bVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f44117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f44118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f44119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f44120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f44122f;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f44117a = Float.NaN;
            this.f44118b = Float.NaN;
            this.f44119c = Float.NaN;
            this.f44120d = Float.NaN;
            this.f44121e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f44144w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44121e);
                    this.f44121e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f44122f = bVar;
                        bVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f44120d = typedArrayObtainStyledAttributes.getDimension(index, this.f44120d);
                } else if (index == 2) {
                    this.f44118b = typedArrayObtainStyledAttributes.getDimension(index, this.f44118b);
                } else if (index == 3) {
                    this.f44119c = typedArrayObtainStyledAttributes.getDimension(index, this.f44119c);
                } else if (index == 4) {
                    this.f44117a = typedArrayObtainStyledAttributes.getDimension(index, this.f44117a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            float f12 = this.f44117a;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f44118b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.f44119c;
            if (!Float.isNaN(f14) && f10 > f14) {
                return false;
            }
            float f15 = this.f44120d;
            return Float.isNaN(f15) || f11 <= f15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f44108a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            C0503a c0503a = null;
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        C0503a c0503a2 = new C0503a(context, xml);
                        this.f44111d.put(c0503a2.f44113a, c0503a2);
                        c0503a = c0503a2;
                    } else if (b10 == 3) {
                        b bVar = new b(context, xml);
                        if (c0503a != null) {
                            c0503a.f44114b.add(bVar);
                        }
                    } else if (b10 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e11);
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                bVar.k(context, xmlResourceParser);
                this.f44112e.put(identifier, bVar);
                return;
            }
        }
    }
}
