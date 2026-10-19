package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.l;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlin.text.n;

/* JADX INFO: loaded from: classes.dex */
public class CachedConfigurationProvider {
    public static final a Companion = new a(null);
    private static final int MISSING_RESOURCE_IDENTIFIER = 0;
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        INTEGER(AttributeType.INTEGER),
        COLOR("color"),
        BOOLEAN("bool"),
        STRING(FeatureFlag.PROPERTIES_TYPE_STRING),
        DRAWABLE_IDENTIFIER("drawable"),
        STRING_ARRAY("array");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f24036b;

        b(String str) {
            this.f24036b = str;
        }

        public final String b() {
            return this.f24036b;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24037a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.STRING_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.DRAWABLE_IDENTIFIER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f24037a = iArr;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f24039c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object obj) {
            super(0);
            this.f24038b = str;
            this.f24039c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Using resources value for key: '");
            sb2.append(this.f24038b);
            sb2.append("' and value: '");
            return B6.c.e(sb2, this.f24039c, '\'');
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f24041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object obj) {
            super(0);
            this.f24040b = str;
            this.f24041c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Using runtime override value for key: '");
            sb2.append(this.f24040b);
            sb2.append("' and value: '");
            return B6.c.e(sb2, this.f24041c, '\'');
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f24043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object obj) {
            super(0);
            this.f24042b = str;
            this.f24043c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Primary key '");
            sb2.append(this.f24042b);
            sb2.append("' had no identifier. No secondary key to read resource value. Returning default value: '");
            return B6.c.e(sb2, this.f24043c, '\'');
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f24044b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception retrieving resource value";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f24045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f24047d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, String str, Object obj) {
            super(0);
            this.f24045b = bVar;
            this.f24046c = str;
            this.f24047d = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to find the xml " + this.f24045b + " configuration value with primary key '" + this.f24046c + "'. Using default value '" + this.f24047d + "'.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f24048b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Resetting cached configuration";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context) {
        this(context, false, null, 6, null);
        kotlin.jvm.internal.i.e(context, "context");
    }

    private final String getFallbackConfigKey(String str) {
        if (n.J(str, "braze", false)) {
            return m.G(str, "braze", "appboy");
        }
        return null;
    }

    private final int getResourceIdentifier(String str, b bVar) {
        if (str == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(str, bVar.b(), this.resourcePackageName);
    }

    public final boolean getBooleanValue(String primaryKey, boolean z10) {
        kotlin.jvm.internal.i.e(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(b.BOOLEAN, primaryKey, Boolean.valueOf(z10));
        kotlin.jvm.internal.i.c(configurationValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) configurationValue).booleanValue();
    }

    public final Integer getColorValue(String primaryKey) {
        kotlin.jvm.internal.i.e(primaryKey, "primaryKey");
        return (Integer) getConfigurationValue(b.COLOR, primaryKey, null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(b type, String key, Object obj) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(key, "key");
        if (this.shouldUseConfigurationCache && this.configurationCache.containsKey(key)) {
            return this.configurationCache.get(key);
        }
        return this.runtimeAppConfigurationProvider.containsKey(key) ? getRuntimeConfigurationValue(type, key, obj) : getResourceConfigurationValue(type, key, obj);
    }

    public final int getDrawableValue(String primaryKey, int i10) {
        kotlin.jvm.internal.i.e(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(b.DRAWABLE_IDENTIFIER, primaryKey, Integer.valueOf(i10));
        kotlin.jvm.internal.i.c(configurationValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) configurationValue).intValue();
    }

    public final int getIntValue(String primaryKey, int i10) {
        kotlin.jvm.internal.i.e(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(b.INTEGER, primaryKey, Integer.valueOf(i10));
        kotlin.jvm.internal.i.c(configurationValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) configurationValue).intValue();
    }

    public final Object getResourceConfigurationValue(b type, String key, Object obj) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(key, "key");
        Object resourceValue = readResourceValue(type, key, obj);
        this.configurationCache.put(key, resourceValue);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(key, resourceValue), 3, (Object) null);
        return resourceValue;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    public final Object getRuntimeConfigurationValue(b type, String key, Object obj) {
        Object objValueOf;
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(key, "key");
        switch (c.f24037a[type.ordinal()]) {
            case 1:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = this.runtimeAppConfigurationProvider;
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                objValueOf = Boolean.valueOf(runtimeAppConfigurationProvider.getBooleanValue(key, ((Boolean) obj).booleanValue()));
                break;
            case 2:
                objValueOf = this.runtimeAppConfigurationProvider.getStringValue(key, (String) obj);
                break;
            case 3:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String?>");
                objValueOf = runtimeAppConfigurationProvider2.getStringSetValue(key, (Set) obj);
                break;
            case 4:
            case 5:
                objValueOf = Integer.valueOf(obj == null ? this.runtimeAppConfigurationProvider.getIntValue(key, 0) : this.runtimeAppConfigurationProvider.getIntValue(key, ((Integer) obj).intValue()));
                break;
            case 6:
                objValueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.getStringValue(key, ""), b.DRAWABLE_IDENTIFIER));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.configurationCache.put(key, objValueOf);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(key, objValueOf), 3, (Object) null);
        return objValueOf;
    }

    public final Set<String> getStringSetValue(String primaryKey, Set<String> set) {
        kotlin.jvm.internal.i.e(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(b.STRING_ARRAY, primaryKey, set);
        return configurationValue == null ? set : (Set) configurationValue;
    }

    public final String getStringValue(String primaryKey, String str) {
        kotlin.jvm.internal.i.e(primaryKey, "primaryKey");
        return (String) getConfigurationValue(b.STRING, primaryKey, str);
    }

    public final Object getValueFromResources(b type, int i10) {
        kotlin.jvm.internal.i.e(type, "type");
        Resources resources = this.context.getResources();
        switch (c.f24037a[type.ordinal()]) {
            case 1:
                return Boolean.valueOf(resources.getBoolean(i10));
            case 2:
                String string = resources.getString(i10);
                kotlin.jvm.internal.i.d(string, "resources.getString(resourceId)");
                return string;
            case 3:
                String[] stringArray = resources.getStringArray(i10);
                kotlin.jvm.internal.i.d(stringArray, "resources.getStringArray(resourceId)");
                return new HashSet(l.s(Arrays.copyOf(stringArray, stringArray.length)));
            case 4:
                return Integer.valueOf(resources.getInteger(i10));
            case 5:
                return Integer.valueOf(resources.getColor(i10));
            case 6:
                return Integer.valueOf(i10);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Object readResourceValue(b type, String key, Object obj) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(key, "key");
        try {
            int resourceIdentifier = getResourceIdentifier(key, type);
            if (resourceIdentifier != 0) {
                return getValueFromResources(type, resourceIdentifier);
            }
            String fallbackConfigKey = getFallbackConfigKey(key);
            if (fallbackConfigKey == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(key, obj), 3, (Object) null);
                return obj;
            }
            int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, type);
            if (resourceIdentifier2 != 0) {
                return getValueFromResources(type, resourceIdentifier2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(type, key, obj), 3, (Object) null);
            return obj;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, g.f24044b);
        }
    }

    public final void resetCache$android_sdk_base_release() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.f24048b, 3, (Object) null);
        this.configurationCache.clear();
    }

    public final void setRuntimeAppConfigurationProvider(RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        kotlin.jvm.internal.i.e(runtimeAppConfigurationProvider, "<set-?>");
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context, boolean z10) {
        this(context, z10, null, 4, null);
        kotlin.jvm.internal.i.e(context, "context");
    }

    public CachedConfigurationProvider(Context context, boolean z10, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(runtimeAppConfigurationProvider, "runtimeAppConfigurationProvider");
        this.context = context;
        this.shouldUseConfigurationCache = z10;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        kotlin.jvm.internal.i.d(mapSynchronizedMap, "synchronizedMap(HashMap())");
        this.configurationCache = mapSynchronizedMap;
        this.resourcePackageName = PackageUtils.getResourcePackageName(this.context);
    }

    public /* synthetic */ CachedConfigurationProvider(Context context, boolean z10, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider, int i10, kotlin.jvm.internal.e eVar) {
        this(context, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? new RuntimeAppConfigurationProvider(context) : runtimeAppConfigurationProvider);
    }
}
