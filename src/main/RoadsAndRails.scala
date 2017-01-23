/**
  * Created by floris on 1/16/17.
  */

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent, FMLServerStartingEvent}

@Mod(modid = "R&R", modLanguage = "scala")
object RoadsAndRails
{
  @Mod.EventHandler
  def preInit(event:FMLPreInitializationEvent){}

  @Mod.EventHandler
  def init(event:FMLInitializationEvent)
  {
    System.out.println("***********************************************")
    System.out.println("*                                             *")
    System.out.println("*       DIRT BLOCK >> Something Awesome       *")
    System.out.println("*                                             *")
    System.out.println("***********************************************")
  }

  @Mod.EventHandler
  def postInit(event:FMLPostInitializationEvent){}

  @Mod.EventHandler
  def onServerStarting(event:FMLServerStartingEvent){}

}