####################################################################################
# OpenJDK Compiling Env Preparation.
####################################################################################

# Skip this will get a error of Hashtable NPE
export LANG=C

# JDK
export ALT_BOOTDIR=/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home
#export ALT_BOOTDIR=/Library/Java/JavaVirtualMachines/1.7.0.jdk/Contents/Home

# Automatically download dependacies
export ALLOW_DOWNLOADS=true

# 并行编译线程数，与CPU核数一致
export HOTSPOT_JOBS=2
export ALT_PARALLEL_COMPILE_JOBS=2

#
export SKIP_COMPARE_IMGAGES=true

#
export USE_PRECOMPILED_HEADER=true

# Compiling contents
export BUILD_LANGTOOLS=true
#export BUILD_JAXP=false
#export BUILD_JAXWS=false
#export BUILD_CORBA=false
export BUILD_HOTSOPT=true
export BUILD_JDK=true

# Compiling version
#export SKIP_DEBUG_BUILD=false
#export SKIP_FASTDEBUG_BUILD=false
#export DEBUD_NAME=debug

# Avoid javaws & applet build
BUILD_DEPLOY=false

# Avoid installation build
BUILD_INSTALL=false

# Result ouput
# export ALT_OUTPUTDIR=/Users/ye_wenda/advance/JVM/jdkBuild/openjdk_7u4/build
export ALT_OUTPUTDIR=/Users/ye_wenda/advance/JVM/jdkBuild/openjdk_6/build
# export ALT_OUTPUTDIR=/Users/ye_wenda/advance/JVM/jdkBuild/openjdk_7/build
# export ALT_OUTPUTDIR=/Users/ye_wenda/advance/JVM/jdkBuild/openjdk_8/build

# Freetype change
export FREETYPE_HEADERS_PATH=/usr/X11R6/include
# no /freetype2/
export ALT_FREETYPE_HEADERS_PATH=/usr/local/freetype/include
#export FREETYPE_HEADERS_PATH=/usr/local/freetype/include/freetype2/
export FREETYPE_LIB_PATH=/usr/X11R6/lib
export ALT_FREETYPE_LIB_PATH=/usr/local/freetype/lib
#export FREETYPE_LIB_PATH=/usr/local/freetype/lib

# Necessity
unset JAVA_HOME
unset CLASSPATH

# Jdk6 require
# export ARCH=x86_64
# export ARCH_DATA_MODEL=64
# export PLATFORM=macosx

make 2>&1 | tee $ALT_OUTPUTDIR/build.log
