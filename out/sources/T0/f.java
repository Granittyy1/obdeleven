package T0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: EmojiTextViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5745a;

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f5746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f5747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5748c = true;

        public a(TextView textView) {
            this.f5746a = textView;
            this.f5747b = new d(textView);
        }

        @Override // T0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f5748c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i13 = 0;
            while (true) {
                d dVar = this.f5747b;
                if (i13 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i13] == dVar) {
                    return inputFilterArr;
                }
                i13++;
            }
        }

        @Override // T0.f.b
        public final boolean b() {
            return this.f5748c;
        }

        @Override // T0.f.b
        public final void c(boolean z10) {
            if (z10) {
                e();
            }
        }

        @Override // T0.f.b
        public final void d(boolean z10) {
            this.f5748c = z10;
            e();
            TextView textView = this.f5746a;
            textView.setFilters(a(textView.getFilters()));
        }

        public final void e() {
            TextView textView = this.f5746a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (this.f5748c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f5754a;
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f5749a;

        public c(TextView textView) {
            this.f5749a = new a(textView);
        }

        @Override // T0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return !androidx.emoji2.text.c.d() ? inputFilterArr : this.f5749a.a(inputFilterArr);
        }

        @Override // T0.f.b
        public final boolean b() {
            return this.f5749a.f5748c;
        }

        @Override // T0.f.b
        public final void c(boolean z10) {
            if (androidx.emoji2.text.c.d()) {
                this.f5749a.c(z10);
            }
        }

        @Override // T0.f.b
        public final void d(boolean z10) {
            boolean zD = androidx.emoji2.text.c.d();
            a aVar = this.f5749a;
            if (zD) {
                aVar.d(z10);
            } else {
                aVar.f5748c = z10;
            }
        }
    }

    public f(TextView textView) {
        this.f5745a = new c(textView);
    }
}
