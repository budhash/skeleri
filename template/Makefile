##################################################################
#          Project Convenience Makefile                          #
##################################################################

#  
######################### DEFINITIONS ############################
ifeq ($(GRD),)
    GRD  := ./gradlew
endif

ifeq ($(GIT),)
    GIT  := git
endif

ifeq ($(JDK),)
    JDK  := java
endif

ifeq ($(KOT),)
    KOT  := kotlinc 
endif

jdk-version:
	@ echo "version: java"
	@ $(JDK) -version
	@ echo "-------------------------------------------------------------------"

kotlin-version:
	@ echo "version: kotlin"
	@ $(KOT) -version
	@ echo "-------------------------------------------------------------------"

gradle-version:
	@ echo "version: gradle"
	@ $(GRD) --version
	@ echo "-------------------------------------------------------------------"

versions: jdk-version kotlin-version gradle-version

build:
	@ $(GRD) build

test:
	@ $(GRD) test

gradle-wrapper-update:
	@ $(GRD) wrapper --gradle-version `cat .env | grep GRADLE_VERSION | sed -n 's/^GRADLE_VERSION=//p'`

gradle-version-update:
	@ $(GRD) versionCatalogUpdate
