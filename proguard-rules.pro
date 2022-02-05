-keepattributes *Annotation*, Exceptions, Signature, Deprecated, SourceFile, SourceDir, LineNumberTable, LocalVariableTable, LocalVariableTypeTable, Synthetic, EnclosingMethod, RuntimeVisibleAnnotations, RuntimeInvisibleAnnotations, RuntimeVisibleParameterAnnotations, RuntimeInvisibleParameterAnnotations, AnnotationDefault, InnerClasses

# Mixin package
-keep class com.example.modobf.mixin.** { *; }
-keepclassmembers @org.spongepowered.asm.mixin.Shadow class *
-keepclassmembers @org.spongepowered.asm.mixin.Overwrite class *
-keepclassmembers @org.spongepowered.asm.mixin.SoftOverride class *
-keepclassmembers @org.spongepowered.asm.mixin.Pseudo class *
-flattenpackagehierarchy
-useuniqueclassmembernames
-overloadaggressively
-renamesourcefileattribute
